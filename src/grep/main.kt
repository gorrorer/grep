package grep
import com.xenomachina.argparser.ArgParser

fun main(args: Array<String>) {
    ArgParser(args).parseInto(::Grep).findStrings()
}
