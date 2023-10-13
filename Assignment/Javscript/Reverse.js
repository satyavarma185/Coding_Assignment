const sentence = prompt("Enter a sentence:")

function reverseWordsInSentence(sentence) {
    const words = sentence.split(' ')

    const reversedWords = words.map(word => {
        return word.split('').reverse().join('')
    })

    const reverseSentence = reversedWords.join(' ')

    console.log(reverseSentence)

}

