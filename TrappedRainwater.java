import java.util.*;

public class TrappedRainwater {
    public static int TrappedWater(int height[]) {
        int n = height.length;
        // Left Max Boundry
        int leftmaxBound[] = new int[n];
        leftmaxBound[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmaxBound[i] = Math.max(leftmaxBound[i - 1], height[i]);
        }
        //// Right Max Boundry
        int rightmaxBound[] = new int[n];
        rightmaxBound[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmaxBound[i] = Math.max(rightmaxBound[i + 1], height[i]);
        }
        /// loop
        int Trapped_Water = 0;
        for (int i = 0; i < n; i++) {
            // W.L=min(left max bound,Right max bound)
            int water_level = Math.min(leftmaxBound[i], rightmaxBound[i]);
            // Water Trapped=W.L-Height
            Trapped_Water += water_level - height[i];

        }
        return Trapped_Water;

    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        int Trapped_Water = TrappedWater(height);
        System.out.print("Rain Water Trapped is: " + Trapped_Water);

        Sc.close();

    }
}
