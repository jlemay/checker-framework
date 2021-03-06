package java.lang;

import org.checkerframework.dataflow.qual.SideEffectFree;
import org.checkerframework.checker.nullness.qual.Nullable;

public
class IncompatibleClassChangeError extends LinkageError {
    private static final long serialVersionUID = 0L;
    @SideEffectFree
    public IncompatibleClassChangeError () {
        super();
    }

    @SideEffectFree
    public IncompatibleClassChangeError(@Nullable String s) {
        super(s);
    }
}
