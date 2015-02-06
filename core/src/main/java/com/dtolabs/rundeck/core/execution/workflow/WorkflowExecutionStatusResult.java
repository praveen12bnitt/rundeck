package com.dtolabs.rundeck.core.execution.workflow;

import com.dtolabs.rundeck.core.execution.StatusResult;

/**
 * Allow a custom status string
 */
public interface WorkflowExecutionStatusResult extends StatusResult {
    /**
     * @return status string
     */
    public String getStatusString();

    /**
     *
     * @return flow control behavior to use
     */
    public ControlBehavior getControlBehavior();

}
