class OTPGenerator {

    // Method to generate a 6-digit OTP
    public static int generateOTP() {
        // Generates number between 100000 and 999999
        return (int)(Math.random() * 900000) + 100000;
    }

    // Method to check if all OTPs are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];

        // Generate OTPs
        for (int i = 0; i < otps.length; i++) {
            otps[i] = generateOTP();
        }

        // Display OTPs
        System.out.println("Generated OTPs:");
        for (int i = 0; i < otps.length; i++) {
            System.out.println(otps[i]);
        }

        // Check uniqueness
        boolean unique = areOTPsUnique(otps);

        if (unique) {
            System.out.println("All 10 OTPs are unique");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}
