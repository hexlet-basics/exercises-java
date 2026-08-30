
Websites constantly send emails to their users. A typical task is to set up automatic sending of a personal email where the header contains the user's name. If a person's name is stored somewhere in the site's database as a string, then the task of generating the header comes down to concatenation: for example, you need to join the string _Hello_ with the string that holds the name.

Write a program that will generate the header and body of the email using the ready-made variables, and print the resulting strings to the screen.

For the header, use the variables `firstName` and `greeting`, a comma, and an exclamation mark. Print it to the screen in the correct order.

For the body of the email, use the variables `info` and `intro`, and the second sentence must be on a new line.

The result on the screen will look like this:

```text
Hello, Joffrey!
Here is important information about your account security.
We couldn't verify you mother's maiden name.
```

Complete the task using only two `System.out.println()`.
