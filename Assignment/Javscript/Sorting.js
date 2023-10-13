const userInput = prompt('Enter numbers separated by commas: ')
const inputArray = userInput.split(',').map(num => parseInt(num, 10))

console.log(inputArray)

const sortedArray = inputArray.sort((a, b) => b - a)

console.log('Sorted array in descending order:', sortedArray)
