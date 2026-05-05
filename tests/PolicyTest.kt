fun main() {
    val signalcase_1 = Signal(69, 85, 16, 15, 9)
    check(Policy.score(signalcase_1) == 144)
    check(Policy.classify(signalcase_1) == "review")
    val signalcase_2 = Signal(67, 83, 10, 14, 7)
    check(Policy.score(signalcase_2) == 156)
    check(Policy.classify(signalcase_2) == "review")
    val signalcase_3 = Signal(92, 93, 11, 7, 9)
    check(Policy.score(signalcase_3) == 250)
    check(Policy.classify(signalcase_3) == "accept")
}
