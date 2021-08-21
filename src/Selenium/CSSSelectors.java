package Selenium;

public class CSSSelectors {
	
	/*  the primary difference between XPath and CSS Selectors is that, with the XPath we can traverse 
	 * 	both forward and backward whereas CSS selector only moves forward. Although CSS selectors perform far better than Xpath
  	Custom CSS

	1. id--> htmltag#id , #id
	2. class --> htmltag.classname, .classname, .c1.c2.c3, htmltag.c1.c2.c3...cn
	3. parent>childtag

	ul#categories
	#username
	input#username
	input.form-control.private-form__control.login-email
	input#username.form-control.private-form__control.login-email
	input.login-email
	.form-control.private-form__control.login-email

	4. htmltag[id='value']
	//div[@id='test']

	input[id='username'] -- css with one attribute
	//input[@id='username'] --xpath

	input[id='username'][type='email'] -- css with two attributes
	//input[@id='username' and @type='email'] -- xpath

	5. contains the text in css:
	input[id*='user']
	input[id*='name']

	id = 
	test_123
	test_345
	test_456
	input[id*=test_]

	6. starting the text in css:
	input[id^='user']

	7. ending the text in css:
	input[id$='name']

	8. comma in css:
	div.private-form__input-wrapper, input#username

	9. first-of-type in css:
	ul#categories>li:first-of-type

	10. last-of-type in css:
	ul#categories>li:last-of-type

	11. nth-of-type
	ul#categories>li:nth-of-type(1)
	ul#categories>li:nth-of-type(14)
	ul#categories>li:nth-of-type(3)
	ul#categories>li:nth-of-type(n) -- all

	12. sibling of element:
	div.private-form__input-wrapper + div
	div.private-form__input-wrapper+div.private-form__meta
	ul#categories>li:nth-of-type(3)+li

	13. not operator in css:
	input.form-control.private-form__control:not(.login-password)

 */

}
