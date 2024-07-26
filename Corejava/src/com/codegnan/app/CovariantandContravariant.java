package com.codegnan.app;

class Animal{
	public Animal getAnimal() {
		System.out.println(this.getClass());
	return this;
	}
}
class Dog extends Animal{
	@Override
	public Dog getAnimal() {
		Dog dog = new Dog();
	System.out.println(this.getClass());
		return dog;
	}
}

public class CovariantandContravariant {
	
		public static void main(String[] args) {
			Dog d=new Dog();
			Animal a = new Animal();
			System.out.println(a.getAnimal());
			System.out.println("   "+d.getAnimal());
		}

	}


//class Animal {  
//    
//    Animal giveBirth() {  
//       
//        System.out.println("An animal gives birth.");  
//        return new Animal();  
//    }  
//}  
//
//class Dog extends Animal {  
//    
//    @Override  
//    Dog giveBirth() {  
//        
//        System.out.println("A dog gives birth to puppies.");  
//        return new Dog();  
//    }  
//}  
//
//public class CovariantandContravariant {  
//    public static void main(String[] args) {  
//        
//        Animal genericAnimal = new Animal();  
//          
//         System.out.println(genericAnimal.giveBirth());  
//        System.out.println("New animal born!");  
// 
//        Dog specificDog = new Dog();  
// 
//         specificDog.giveBirth();  
//        System.out.println("New dog born!");  
//    }  
//}  
//

