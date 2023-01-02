package com.in28minutes.rest.webservices.restfulwebservices.Assignments5;

public class EmployeeDetails {
		
		private Integer empId;
		private String empName;
		private String empDept;
		private String empDesignation;
		private Integer empSalary;
		
		
		public EmployeeDetails(Integer empId, String empName, String empDept, String empDesignation, Integer empSalary) {
			super();
			this.empId = empId;
			this.empName = empName;
			this.empDept = empDept;
			this.empDesignation = empDesignation;
			this.empSalary = empSalary;
		}
		public Integer getEmpId() {
			return empId;
		}
		public void setEmpId(Integer empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getEmpDept() {
			return empDept;
		}
		public void setEmpDept(String empDept) {
			this.empDept = empDept;
		}
		public String getEmpDesignation() {
			return empDesignation;
		}
		public void setEmpDesignation(String empDesignation) {
			this.empDesignation = empDesignation;
		}
		public Integer getEmpSalary() {
			return empSalary;
		}
		public void setEmpSalary(Integer empSalary) {
			this.empSalary = empSalary;
		}
		
		@Override
		public String toString() {
			return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empDesignation="
					+ empDesignation + ", empSalary=" + empSalary + "]";
		}
		
		
		

}
