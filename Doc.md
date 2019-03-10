# Documentation on WordLadder implemented in Java by Wang Shaoyu.

### The Java Application has two classes, a **WordLadder** class as the main class which contains 
* a Stack attribute named path used to store the result so that unit test can use this as a criterion of correctness.
* a main method as an interface to take input from command line and make preparations for the ladder,
* a ladder() method used to generate the desired ladder if it exists, or return a null if it doesn't,
* ` Stack<String> ladder(ArrayDeque<Stack<String>> paths, String des, Dictionary chosen,Dictionary lexicon) `
* three ancillary methods named newWord, newLadder, printResult to generate a new word which is one alphabet different from the original word, a new ladder with one more word than the original ladder, and print the final ladder should it exists,
* `String NewWord(int j, String frontWord, int wordLength, char c)`
* `Stack<String> newLadder(String newWord, Stack<String> Ladder)`
* `void printResult(Stack<String> ladder)`
### and a Dictionary method which contains
* a HashMap<String,int> attribute named lexicon used to store words.

* a buildDictionary method which takes the String and extracts words from it and the stores them in the lexicon, not being of much use in the application while possibly making unit tests easier (which it doesn't).
* `void buildLexicon(String text)`
* a Construtor which takes the path of the dictionary file and generate a Dictionary instance with its contents.
* `Dictionary(String path)`
* two ancillary methods hasWord and addWord providing interface to the Lexicon attribute.
* `boolean hasWord(String word)`
* `void addWord(String word)`