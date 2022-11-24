// Inline func 
inline fun Fnc(str: String, myfun: (String) -> Unit) { // req args string & function
    myfun(str) // running func
}
inline fun Fnc2(crossinline mylmbda: () -> Unit) { // So to stop returning from the lambda expression we can mark it using the crossline
    mylmbda()
}

/**
    Sometimes we need to access the type of parameter passed during the call. We have to simply pass the parameter at the time of function calling and we can retrieve
    the type of the parameter using a reified modifier
**/
inline fun <reified C> reifiedFunc() {
    println(C::class)
}


/* Inline Variables :-
    Inlined function copy the code to the calling place, similarly inline keyword copy the inline properties accessor methods to calling place. 
    The inline modifier can be used on accessors of properties that don’t have a backing field. 
*/

inline var variable: Int
	get() = 96
	set(newValue) {
    	newValue
	}

// Inline functions in Kotlin - not allocate mem
fun main() {
    //     calling functions 
    Fnc("Hii", ::println) // passing str & func ::
    Fnc2({
        Fnc("From lambda", ::println)
    })
    reifiedFunc < String > ()
    println(variable)
}
