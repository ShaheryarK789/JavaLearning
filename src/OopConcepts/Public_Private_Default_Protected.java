package OopConcepts;

public class Public_Private_Default_Protected {

	/*
	
	
	Access Modifier		within class	within package		outside package by subclass only		outside package
		
		Private				Y					N				N										N
		Default				Y					Y				N										N
		Protected			Y					Y				Y										N
		Public				Y					Y				Y										Y
	
	
	Private:

	Private members are visible in the same class only 
	
	Default
	
	Methods and variables declared in a class without any access specifiers are called default.
	Default members in Class A are visible to the other classes which are inside the package 
	and invisible to the classes which are outside the package.
	
	Protected
	
	Protected is the same as Default but if a class extends then it is visible even if it is outside the package.
	
	Public:

	Public members are visible to all packages.
	
	
	Local variable
	created within method
	
	instance variable
	created within class outside method
	*
	*
	*/
}
