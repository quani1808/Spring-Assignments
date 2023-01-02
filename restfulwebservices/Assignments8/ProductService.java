package com.in28minutes.rest.webservices.restfulwebservices.Assignments8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class ProductService {
	private static List<Product> product=new ArrayList<>();
    private static int ProductCount =0;
    static
    {
        product.add(new Product(++ProductCount,"Pencil",10,"Apsara"));
        product.add(new Product(++ProductCount,"Pen",15,"BallPoint"));
        product.add(new Product(++ProductCount,"Smartphone",20000,"Samsung"));
        product.add(new Product(++ProductCount,"Earphopnes",200,"Realme"));
                
                
    }    
    public Product save1(Product pro)
    {
        pro.setId(++ProductCount);
        product.add(pro);
        return pro;
    }
    public List<Product> findAll()
    {
        return product;
    }
    public Product findOne1(int id)
    {
        Predicate<? super Product> predicate=user->user.getId().equals(id);
        return product.stream().filter(predicate).findFirst().orElse(null);
        }
    public void deleteById1(int id)
    {
    	Predicate<? super Product> predicate=user->user.getId().equals(id);
        product.removeIf(predicate);
    }
public void updateById(int id, Product p) {
        
        for(int i=0;i<product.size();i++)
        {
            Product pd=product.get(i);
            if(pd.getId().equals(id))
            {
                product.set(i, p);
                
            }
        }
    }
}
