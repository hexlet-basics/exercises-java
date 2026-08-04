
Data entered by users in forms often contains extra whitespace characters at the end or the beginning of the string. In addition, users can enter the same thing in different cases, which later interferes with working with the data. That is why, before adding them, the data is processed (they say normalized). Basic processing includes two actions:

* Removing edge whitespace characters using the `.trim()` method, for example, it was: `"   hexlet\n "`, it became: `"hexlet"`
* Converting to lowercase using the `toLowerCase()` method. It was: `"SUPPORT@hexlet.io"`, it became: `"support@hexlet.io"`.

Update the `email` variable by writing into it the same value, but processed according to the scheme indicated above. Print what you got to the screen.
