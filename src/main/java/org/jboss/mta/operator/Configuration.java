package org.jboss.mta.operator;

import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;

import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Singleton;

public class Configuration {
    @Produces
    @Singleton
    KubernetesClient newClient(@Named("namespace") String namespace) {
      return new DefaultKubernetesClient().inNamespace(namespace);
    }
}