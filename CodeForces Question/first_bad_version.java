public class first_Bad_Version {

    // Simulate the bad version for testing purposes
    private static int badVersion = 4;  // Example: Assume version 4 is the first bad version

    public static void main(String[] args) {
        First_Bad_Version obj = new First_Bad_Version();
        int n = 10; // Total number of versions
        System.out.println("First bad version is: " + obj.firstBadVersion(n));
    }

    public int firstBadVersion(int n) {
        int lo = 1;
        int hi = n;
        int ans = 0;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2; // Calculate mid to avoid overflow
            if (isBadVersion(mid)) {
                ans = mid; // Potential first bad version
                hi = mid - 1; // Check earlier versions
            } else {
                lo = mid + 1; // Check later versions
            }
        }
        return ans;
    }

    // Simulate the isBadVersion API
    public boolean isBadVersion(int version) {
        return version >= badVersion;  // Returns true if version is bad or later
    }
}
