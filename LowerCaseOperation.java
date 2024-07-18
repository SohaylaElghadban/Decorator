class LowerCaseOperation extends Decerator {
    public LowerCaseOperation(StringOperations operations) {

        super(operations);
    }
    @Override
    public String apply(String operation) {
        operation = super.apply(operation);
        return operation.toLowerCase();
    }
}
