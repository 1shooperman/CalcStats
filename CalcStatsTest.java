import org.junit.*;
import static org.junit.Assert.*;

public class CalcStatsTest {

    @Test
    public void instr_example_min() {

        int[] example = {6, 9, 15, -2, 92, 11};

        assertEquals(-2, CalcStats.min(example));
    }

    @Test
    public void instr_example_max() {

        int[] example = {6, 9, 15, -2, 92, 11};

        assertEquals(92, CalcStats.max(example));
    }

    @Test
    public void instr_example_count() {

        int[] example = {6, 9, 15, -2, 92, 11};
        assertEquals(6, CalcStats.size(example));
    }

    @Test
    public void instr_example_mean() {

        int[] example = {6, 9, 15, -2, 92, 11};

        assertEquals(21.833333, CalcStats.mean(example), 1e-6);
    }
    
    @Test
    public void zeroes() {

        int[] example = {0,0,0,0,0,0,0};

        assertEquals(0.0, CalcStats.mean(example), 1e-6);
        assertEquals(0, CalcStats.max(example));
        assertEquals(0, CalcStats.min(example));
        assertEquals(7, CalcStats.size(example));
    }
    
    @Test
    public void equals() {

        int[] example = {1,1,1,1,1,1,1,1};

        assertEquals(1.0, CalcStats.mean(example), 1e-6);
        assertEquals(1, CalcStats.max(example));
        assertEquals(1, CalcStats.min(example));
        assertEquals(8, CalcStats.size(example));
    }
}

