package ru.easyjava.junit;

import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;

import java.util.ArrayList;
import java.util.List;

public class LongitudesSupplier extends ParameterSupplier {
    @Override
    public List<PotentialAssignment> getValueSources(ParameterSignature parameterSignature) {
        List<PotentialAssignment> result = new ArrayList<PotentialAssignment>();

        result.add(PotentialAssignment.forValue("37.2675", 37.2675));
        result.add(PotentialAssignment.forValue("0", 0));
        result.add(PotentialAssignment.forValue("-180", -180));
        result.add(PotentialAssignment.forValue("30.2625", 30.2625));
        result.add(PotentialAssignment.forValue("180", 180));

        return result;
    }
}
