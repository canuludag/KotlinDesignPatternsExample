fun main(args: Array<String>) {
    var manager = StrategyManager(AddOperation())
    var result = manager.executeStrategy(32, 23)
    println(result)

    manager = StrategyManager(MultiplyOperation())
    result = manager.executeStrategy(45, 100)
    println(result)

}