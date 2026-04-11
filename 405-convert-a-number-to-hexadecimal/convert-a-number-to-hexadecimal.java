class Solution {
    public String toHex(int num) {
        
        if (num == 0) {
            return "0";
        }
        
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        
        while (num != 0) {
            
            int lastFourBits = num & 15;  // 15 = 1111 (binary)
            result.append(hexChars[lastFourBits]);
            num = num >>> 4;  // Unsigned right shift
        }
        
        return result.reverse().toString();
    }
}
