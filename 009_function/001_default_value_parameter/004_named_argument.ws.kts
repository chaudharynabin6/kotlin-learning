//When calling a function, you can name one or more of its arguments.
// This can be helpful when a function has many arguments and it's difficult to
// associate a value with an argument, especially if it's a boolean or null value.

//When you use named arguments in a function call, you can freely change the
// order they are listed in, and if you want to use their default values,
// you can just leave these arguments out altogether.

fun reformat(
    str: String,
    normalizeCase: Boolean = true,
    upperCaseFirstLetter: Boolean = true,
    divideByCamelHumps: Boolean = false,
    wordSeparator: Char = ' ',
) { /*...*/ }

reformat(
    "String!",
    false,
    upperCaseFirstLetter = false,
    divideByCamelHumps = true,
    '_'
)