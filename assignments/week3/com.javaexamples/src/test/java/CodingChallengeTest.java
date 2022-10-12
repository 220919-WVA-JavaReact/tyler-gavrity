import collections.testing.CodingChallenge;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CodingChallengeTest {

    static CodingChallenge answer;

    @BeforeClass
    public static void setUp(){
        answer = new CodingChallenge();
    }

    @Test
    public void codingChalMuliplier(){
        //create an array for the test
        int[] testArray = {2,4,6,8};
        int[] expectedOutput = {4, 8, 12, 16};

        Assert.assertArrayEquals(expectedOutput, answer.codingChallenge(testArray));
    }


    @Test
    public void codingChalMuliplier2(){
        //create an array for the test
        int[] testArray = {10,9,7,2};
        int[] expectedOutput = {20, 18, 14, 4};

        Assert.assertArrayEquals(expectedOutput, answer.codingChallenge(testArray));
    }

    @Test
    public void codingChalMuliplier3(){
        //create an array for the test
        int[] testArray = {14,12,30,120};
        int[] expectedOutput = {28, 24, 60, 240};

        Assert.assertArrayEquals(expectedOutput, answer.codingChallenge(testArray));
    }

    @Test
    public void codingChalMuliplier4(){
        //create an array for the test
        int[] testArray = {15,11,40,1000};
        int[] expectedOutput = {30, 22, 80, 2000};

        Assert.assertArrayEquals(expectedOutput, answer.codingChallenge(testArray));
    }
}
