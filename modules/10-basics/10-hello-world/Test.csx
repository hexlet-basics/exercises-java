#r "nuget: FluentAssertions, 6.2.0"
#load "App.cs"

using System;
using FluentAssertions;

var expected = "Hello, World!";
var capturedConsoleOutput = new StringWriter();
Console.SetOut(capturedConsoleOutput);

App.Run();
var output = capturedConsoleOutput.ToString().Trim();
output.Should().Be(expected);




