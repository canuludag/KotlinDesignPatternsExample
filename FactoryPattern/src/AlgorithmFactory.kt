class AlgorithmFactory {
    fun createAlgorithm(algorithmType: AlgorithmType) : Algorithm {
        return when (algorithmType) {
            AlgorithmType.MERGE_SORT -> MockMergeSort()
            AlgorithmType.QUICK_SORT -> MockQuickSort()
        }
    }
}