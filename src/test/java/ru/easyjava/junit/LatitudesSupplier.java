package ru.easyjava.junit;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class LatitudesSupplier extends ParameterSupplier {
    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        List<PotentialAssignment> result = new ArrayList<PotentialAssignment>();

        result.add(PotentialAssignment.forValue("55.596111", 55.596111));
        result.add(PotentialAssignment.forValue("0", 0));
        result.add(PotentialAssignment.forValue("-90", -90));
        result.add(PotentialAssignment.forValue("59.8002778", 59.8002778));
        result.add(PotentialAssignment.forValue("90", 90));

        return result;
    }
}
