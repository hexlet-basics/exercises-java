At the very lowest level, a computer works only with zeros and ones. This is binary code. Each zero or one is called a bit (from binary digit).

Any data inside a computer is a sequence of bits. This is how images, music, and text are stored. The usual numbers from the decimal system can also be represented in binary form:

- 0 → `0`
- 1 → `1`
- 2 → `10`

## How to encode text

A computer does not "understand" letters. To store text, characters are turned into numbers. This is what encodings do. An encoding is a table where each character corresponds to a specific number.

The most direct way is to number the letters, starting from one:

- `a` → `1`
- `b` → `2`
- ...and so on up to `z` → `26`

Now the word hello turns into a set of numbers:

```text
h e l l o
↓ ↓ ↓  ↓  ↓
8 5 12 12 15
```

The program does not know that it is dealing with a word. It sees the instruction "show the character with code 8, then with code 5" and so on. The word good in the same table will turn into the codes 7, 15, 15, and 4.

## ASCII. The first mass encoding

The first computers worked mostly with the English language. For it, in the 1960s, the ASCII table of 128 characters was invented. It included the Latin alphabet, digits, punctuation marks, special characters like `@`, `#`, `!`, and control codes.

For early programs this was enough, but not for the whole world. When computers reached other countries, a problem arose. ASCII has no Cyrillic, hieroglyphs, Arabic script, accents, or currency symbols.

Then each country or company began to make its own table based on ASCII. Windows invented Windows-1251 for Russian, Apple created Mac Roman, and their own variants appeared in Asia and the Middle East.

These tables were incompatible with each other. Code 226 in one encoding meant the letter é, and in another a completely different character. Text written in one table and read in another turned into garbage.

## Garbled text

If, instead of words, something like this appears in the text:

```text
ÐÑÐ¸Ð²ÐµÑ
```

it means that the program read the bytes with the wrong table. It got a set of numbers but matched them with the wrong characters. In the 1990s and 2000s this happened all the time.

## Unicode and UTF-8

To reduce all the tables to one, work on Unicode began in the 1990s. It is a common table that includes the characters of all the writing systems in the world. It has the Latin and Cyrillic alphabets, Chinese and Arabic script, mathematical signs, ancient alphabets, and even emoji.

Inside Unicode there are several storage formats. The most common of them is UTF-8. It encodes English characters compactly, and expands as needed for the rest of the characters.

Today UTF-8 is the default on the internet, in Linux, in databases, and in code editors. Java stores text in Unicode, so letters of any language and symbols like `©` or `€` are displayed the same way in any system.

## Why you need to know this

Text appears in every program, and encoding errors still happen. Most often this occurs when reading files, processing data, and exchanging data with databases. If garbled text appears on the screen, it is almost always a mixed-up encoding. It is worth remembering UTF-8 when working with external files too, because the editor or the system could have saved them in a different table.
