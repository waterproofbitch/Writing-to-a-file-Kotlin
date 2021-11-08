import java.io.LineNumberReader
import java.io.File
import java.nio.charset.Charset


fun main () {

    var readfail = readLine()
    var jfd = File(readfail).readText()
    println(jfd)
    var ee1 = 1


    val imput = File("imput").writeText(jfd)


    val File = File("imput").bufferedWriter()








    var f = File("imput")
    if (!f.exists()) {
        f.createNewFile()
    }

    f.appendText("\nFE", Charset.defaultCharset())



}