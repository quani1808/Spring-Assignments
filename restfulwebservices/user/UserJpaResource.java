package com.in28minutes.rest.webservices.restfulwebservices.user;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.in28minutes.rest.webservices.restfulwebservices.jpa.UserRepository;

@RestController
public class UserJpaResource
{
	private UserRepository repository;
    private PostRepository postRepository;
    
    public UserJpaResource(UserRepository repository, PostRepository postRepository) {    
        this.repository=repository;
        this.postRepository=postRepository;
    }
    
    
    //GET users
    @GetMapping("/jpa/users")
    public List<User> retrieveAllUser(){
        return repository.findAll();
    }
    
   

	@DeleteMapping("/jpa/users/{id}")
    public void deleteUsers(@PathVariable int id){
    repository.deleteById(id);
  
    }
    
    //post a user means creating a user to the existed one
    
    @PostMapping("/jpa/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
   	 
        User savedUser = repository.save(user);
        
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        
        return ResponseEntity.created(location).build();
    }
    
    @GetMapping("/jpa/users/{id}")
    public EntityModel<User> retrieveForUsers(@PathVariable int id){
      Optional<User> user= repository.findById(id);
      
            if(user.isEmpty())
                throw new UserNotFoundException("id:"+id);
            
        EntityModel<User> entitymodel=EntityModel.of(user.get());
        
        WebMvcLinkBuilder link=linkTo(methodOn(this.getClass()).retrieveAllUser());
             entitymodel.add(link.withRel("all-users"));
             
                     return entitymodel;
    }
    
    @GetMapping("/jpa/users/{id}/posts")
    public List<Post> retrievePostsForUser(@PathVariable int id){
      Optional<User> user= repository.findById(id);
      
            if(user.isEmpty())
                throw new UserNotFoundException("id:"+id);
            return user.get().getPosts();
            
    }
    

    

    @PostMapping("/jpa/users/{id}/posts")
    public ResponseEntity<Object> createPostsForUser(@PathVariable int id,@Valid @RequestBody Post post){
   	 Optional<User> user= repository.findById(id);
        
        if(user.isEmpty())
            throw new UserNotFoundException("id:"+id);
        
        post.setUser(user.get());
        Post savedPost =  postRepository.save(post);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedPost.getId())
                .toUri();
        
        return ResponseEntity.created(location).build();
  
     }

}