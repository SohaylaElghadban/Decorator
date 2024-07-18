import java.util.Arrays;

class SortOperation extends Decerator {

    public SortOperation(StringOperations operations) {
        super(operations);
    }

    @Override
    public String apply(String operation) {
        operation = super.apply(operation);
        char[] chars = operation.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}


