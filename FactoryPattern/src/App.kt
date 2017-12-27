fun main(args: Array<String>) {
    var algorithm = AlgorithmFactory().createAlgorithm(AlgorithmType.QUICK_SORT)
    algorithm.run()

    algorithm = AlgorithmFactory().createAlgorithm(AlgorithmType.MERGE_SORT)
    algorithm.run()
}