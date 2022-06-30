//(1) Goal. Write an algorithm for accepting two numbers, divide the first number by second and display their quotient.
// store input numbers
const num1 = parseInt(prompt('Enter the first number '));
const num2 = parseInt(prompt('Enter the second number '));
// preventing failure
if (num1 == 0 ) {
  num1 = 1;
}
if (num2 == 0 ) {
  num2 = 1;
}
//devide two numbers
const div = (num1 / num2);;

// display the sum
console.log(`The div of ${num1} and ${num2} is ${div}`);