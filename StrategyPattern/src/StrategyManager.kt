class StrategyManager(aStrategy: Strategy) {
    private var strategy: Strategy = aStrategy

    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }

}