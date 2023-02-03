package org.airbus.Visitor;

public interface ICleanable {
    void accept(ICleaningProcedure cleaningProcedure);
}
