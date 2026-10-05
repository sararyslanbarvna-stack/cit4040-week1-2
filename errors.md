# Task 2.3: Compiler Error Log

1. **Semicolon removed:** `Main.java:3: error: ';' expected`
   - *Explanation:* The Java compiler requires every simple statement to end with a semicolon to indicate termination.
2. **System.out.printline:** `Main.java:3: error: cannot find symbol`
   - *Explanation:* The compiler could not find a method named `printline` on the `PrintStream` object because the correct standard library method is `println`.
3. **Class named Application in Main.java:** `Main.java:1: error: class Application is public, should be declared in a file named Application.java`
   - *Explanation:* In Java, a public class must match the name of the source `.java` file.
4. **Removed static keyword:** `Error: Main method is not static in class Main, please define the main method as: public static void main(String[] args)`
   - *Explanation:* The Java Virtual Machine requires `main` to be `static` so it can execute the entry point without creating an instance of the class first.

---

# Task 3.4: NullPointerException Stack Trace

```text
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	at Main.main(Main.java:6)
x# 1. Clean up stale class files if any exist
rm -f *.class

# 2. Safely create errors.md without string escaping issues
cat << 'EOF' > errors.md
# Task 2.3: Compiler Error Log

1. Semicolon removed: Main.java:3: error: ';' expected
   - Explanation: The Java compiler requires every simple statement to end with a semicolon to indicate termination.
2. System.out.printline: Main.java:3: error: cannot find symbol
   - Explanation: The compiler could not find a method named printline on the PrintStream object because the correct standard library method is println.
3. Class named Application in Main.java: Main.java:1: error: class Application is public, should be declared in a file named Application.java
   - Explanation: In Java, a public class must match the name of the source .java file.
4. Removed static keyword: Error: Main method is not static in class Main, please define the main method as: public static void main(String[] args)
   - Explanation: The Java Virtual Machine requires main to be static so it can execute the entry point without creating an instance of the class first.

---

# Task 3.4: NullPointerException Stack Trace

Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
    at Main.main(Main.java:6)

- File and line causing exception: Main.java, line 6.
- First line mentioning custom code: Line 2 of the trace (at Main.main(Main.java:6)).
- Single change to prevent it: Add a null check (if (str != null)) or initialize str with a non-null string value before calling methods on it.
