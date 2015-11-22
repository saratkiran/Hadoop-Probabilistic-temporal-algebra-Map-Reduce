package tzamanhadoop.pmf;


/**
* The <code>UniformPMF</code> class is an implementation of <code>ProbabilityMassFunction</code>
* over a uniformly distributed mass function.
* 
* For a <code>UniformPMF</code>, conversions between precision and coarseness are generally
* much faster than for non-uniformly distributed mass functions, and require less space. 
*
* @author  Curtis Dyreson, Alex Henniges, and Richard Snodgrass
* @version 2.0, Sep/9/2008
* @see     tauzaman.timestamp.Granule
* @status NOT YET IMPLEMENTED
**/
public class UniformPMF extends ProbabilityMassFunction {

	public int getCoarseness(int partialMass) {
		return 0;
	}

	public int getPrecision(int coarseness) {
		return 0;
	}

}
