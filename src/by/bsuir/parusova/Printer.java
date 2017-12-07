package by.bsuir.parusova;

class Printer {
    static void print(String str) {
        System.out.println("Output: " + str);
    }
	
	static void printMessages(String[] messages) {
		for (String message : messages) {
			System.out.println("Output[" + (i + 1) + "]: " + message);
		}
	}
}
