package ru.vsu.cs.semenov_d_s;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.semenov_d_s.utils.ArrayUtils;
import ru.vsu.cs.semenov_d_s.utils.ListUtils;

import java.util.List;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testSolution1() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput1.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput1.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput1.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution2() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput2.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput2.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput2.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution3() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput3.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput3.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput3.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution4() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput4.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput4.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput4.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution5() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput5.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput5.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput5.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution6() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput6.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput6.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput6.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution7() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput7.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput7.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput7.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution8() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput8.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput8.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput8.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution9() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput9.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput9.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput9.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }

    @Test
    public void testSolution10() {
        int[] array1 = ArrayUtils.readIntArrayFromFile("testSrc/testInput10.1.txt");
        int[] array2 = ArrayUtils.readIntArrayFromFile("testSrc/testInput10.2.txt");
        List<Integer> list1 = ListUtils.intArrayToList(array1);
        List<Integer> list2 = ListUtils.intArrayToList(array2);

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput10.txt");

        List<Integer> factualResultInList = solution.isOnlyInTheFirstAndSecondList(list1, list2);
        int[] factualResultInArray = ListUtils.intListToArray(factualResultInList);

        Assert.assertArrayEquals(expectedResult, factualResultInArray);
    }
}