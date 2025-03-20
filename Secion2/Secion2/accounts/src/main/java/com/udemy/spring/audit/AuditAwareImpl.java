package com.udemy.spring.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("auditAwareImpl")
public class AuditAwareImpl implements AuditorAware {

    /**
     * Returns the current auditor, which is the user that is currently logged in.
     *
     * @return The current auditor, or an empty Optional if there is no auditor.
     */
    @Override
    public Optional getCurrentAuditor() {
        return Optional.of("ACCOUNTS_MS");
    }

}
