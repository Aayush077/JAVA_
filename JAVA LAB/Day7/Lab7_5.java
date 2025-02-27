/*

Create an user defined exception named CheckArgument to check
the number of arguments passed through command line. If the number of arguments is
less than four then throw the Check Argument exception, else print the addition of squares
of all the four elements.
Input: 4 3 2 1
Output : 30
Input: 4 3 2
Output : Exception occurred - CheckArgument

*/


class CheckArgument extends Exception{
	CheckArgument(String s)
		super(s);
}