class UpperCaseOperation extends Decerator {
    public UpperCaseOperation(StringOperations operations) {
        super(operations);
    }

    @Override
    public String apply(String operation) {
        operation = super.apply(operation);
        return operation.toUpperCase();
    }
}
