package com.hexaware.webex;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hexaware.webex.Entities.User;
import com.hexaware.webex.UserRepo.UserRepository;

@SpringBootApplication
public class Application {
		public static void main(String[] args) {
			ApplicationContext  context=SpringApplication.run(Application.class, args);
			
			UserRepository rep=	context.getBean(UserRepository.class);
			
			
			
			// to print all data in list 
		Iterable<User>  users=rep.findAll();
		users.forEach((temp)-> System.out.println(temp.toString()));
		
		
	
            //to save data in backend
			/*User user1= new User();
			user1.setUserId(100);
			user1.setName("shuba");   --- just change the required userid, name and fee to create new data - dont change "user1" - that is default
			
			user1.setFee(11000.9);
			rep.save(user1);
			*/
			
			// to update name for already existing ones
			/*Optional<User> u=	rep.findById(100);
			
			 if(u.isPresent())
			 {
				
				    User temp=u.get();
				    
				   temp.setUserId(103);
				   rep.save(temp);
				
			 }
			 else
			 {
				 System.out.println("Not Found");
			 }
			*/			
		 
		 
		
            // delete by giving id
			/*rep.deleteById(100);
			System.out.println("Removed");
			*/
		
			// to delete if exist or not found
			/*Optional<User>u= rep.findById(100);
			
			System.out.println(u);
			if(u.isPresent())
			{
				rep.deleteById(100);
			}
			else
			{
				System.out.println("Not Found");
			}
			*/
			
			
			
			
		}
	 
	}
	 