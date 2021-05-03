{"ClusterName" "b0c2d108-0603-41c3-9a8f-0a37eba5df49",
 "LastChecked" "2020-01-23T16:15:59.478901889Z",
 "OrgID" 656485,
 "Version" "xyzzy",
 "Report"
   {"fingerprints" [],
    "info"
      [{"component" "ocp.rules.cluster_id.report",
              "details" {"cluster_id" "b0c2d108-0603-41c3-9a8f-0a37eba5df49",
                         "grafana_link" "N/A",
                         "info_key" "GRAFANA_LINK",
                         "type" "info"},
              "info_id" "cluster_id|GRAFANA_LINK",
              "key" "GRAFANA_LINK",
              "links" {},
              "tags" [],
              "type" "info"} {"component" "ocp.rules.version_info.report",
                                    "details" {"current" "4.3.0-0.ci-2020-01-06-150524",
                                               "desired" "4.3.0-0.ci-2020-01-11-070221",
                                               "info_key" "CLUSTER_VERSION_INFO",
                                               "type" "info",
                                               "update_time" "5 days 8 hours 42 minutes 51 seconds"},
                                    "info_id" "version_info|CLUSTER_VERSION_INFO",
                                    "key" "CLUSTER_VERSION_INFO",
                                    "links" {},
                                    "tags" [],
                                    "type" "info"}],
    "reports"
      [{"component"
                "ccx_rules_ocp.external.rules.cluster_wide_proxy_auth_check.report",
              "details" {"current" "4.3.0-0.ci-2020-01-06-150524",
                         "desired" "4.3.0-0.ci-2020-01-11-070221",
                         "error_key" "AUTH_OPERATOR_PROXY_ERROR",
                         "type" "rule"},
              "key" "AUTH_OPERATOR_PROXY_ERROR",
              "links" {},
              "rule_id" "version_check|AUTH_OPERATOR_PROXY_ERROR",
              "tags" [],
              "type" "rule"}],
    "skips"
      [{"details"
                "All: ['ocp.metrics.version.VersionMetric', 'ocp.metrics.version_available_updates.VersionAvailableUpdatesMetric'] Any: ",
              "reason" "MISSING_REQUIREMENTS",
              "rule_fqdn" "ocp.rules.telemetry.version_info.report",
              "type" "skip"} {"details"
                                      "All: ['ocp.specs.must_gather_ocs.PersistentVolumeClaimsMGOCS'] Any: ",
                                    "reason" "MISSING_REQUIREMENTS",
                                    "rule_fqdn" "ocp.rules.ocs.pvc_phase_check.report",
                                    "type" "skip"} {"details" "All: ['ocp.metrics.version.VersionMetric'] Any: ",
                                                          "reason" "MISSING_REQUIREMENTS",
                                                          "rule_fqdn" "ocp.rules.telemetry.version_check.report",
                                                          "type" "skip"} {"details"
                                                                                  "All: ['ocp.metrics.subscription_labels.SubscriptionLabelsMetric'] Any: ",
                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                "rule_fqdn" "ocp.rules.telemetry.support_check.report",
                                                                                "type" "skip"} {"details"
                                                                                                        "All: ['ocp.models.machine_pools.MachinePool', 'ocp.specs.must_gather.OCVersionCurrentLogs'] Any: ",
                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                      "rule_fqdn" "ocp.rules.machine_update_stuck.report",
                                                                                                      "type" "skip"} {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                            "rule_fqdn" "ocp.rules.certificates_info.report",
                                                                                                                            "type" "skip"} {"details" "All: ['ocp.models.events.Events'] Any: ",
                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                  "rule_fqdn" "ocp.rules.event_nfs_conf.report",
                                                                                                                                                  "type" "skip"} {"details" "All: ['ocp.models.machine_pools.MachinePool'] Any: ",
                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                        "rule_fqdn" "ocp.rules.machine_pool_info.report",
                                                                                                                                                                        "type" "skip"} {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                              "rule_fqdn" "ocp.rules.certificates_expiration.report",
                                                                                                                                                                                              "type" "skip"} {"details" "All: ['ocp.models.certificates.Certificates'] Any: ",
                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                    "rule_fqdn" "ocp.rules.certificates_validity.report",
                                                                                                                                                                                                                    "type" "skip"} {"details" "All: ['ocp.models.machine_pools.MachinePool'] Any: ",
                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                          "rule_fqdn" "ocp.rules.machine_pool_check.report",
                                                                                                                                                                                                                                          "type" "skip"} {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                                                                                                                                                                                                                                                                "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                "rule_fqdn" "ocp.rules.nodes_info.report",
                                                                                                                                                                                                                                                                "type" "skip"} {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                                                                                                                                                                                                                                                                                      "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                      "rule_fqdn" "ocp.rules.pods_check_containers.report",
                                                                                                                                                                                                                                                                                      "type" "skip"} {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                                                                                                                                                                                                                                                                                                            "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                            "rule_fqdn" "ocp.rules.nodes_pressure_check.report",
                                                                                                                                                                                                                                                                                                            "type" "skip"} {"details" "All: ['ocp.models.operators.Operators'] Any: ",
                                                                                                                                                                                                                                                                                                                                  "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                  "rule_fqdn" "ocp.rules.unable_to_sync_storage.report",
                                                                                                                                                                                                                                                                                                                                  "type" "skip"} {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                                                                                                                                                                                                                                                                                                                                                        "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                                        "rule_fqdn" "ocp.rules.pods_crash_loop_check.report",
                                                                                                                                                                                                                                                                                                                                                        "type" "skip"} {"details" "All: ['ocp.models.nodes.Nodes'] Any: ",
                                                                                                                                                                                                                                                                                                                                                                              "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                                                              "rule_fqdn" "ocp.rules.nodes_requirements_check.report",
                                                                                                                                                                                                                                                                                                                                                                              "type" "skip"} {"details" "All: ['ocp.models.operators.Operators'] Any: ",
                                                                                                                                                                                                                                                                                                                                                                                                    "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                                                                                    "rule_fqdn" "ocp.rules.operators_check.report",
                                                                                                                                                                                                                                                                                                                                                                                                    "type" "skip"} {"details" "All: ['ocp.models.pods.Pods'] Any: ",
                                                                                                                                                                                                                                                                                                                                                                                                                          "reason" "MISSING_REQUIREMENTS",
                                                                                                                                                                                                                                                                                                                                                                                                                          "rule_fqdn" "ocp.rules.pods_check.report",
                                                                                                                                                                                                                                                                                                                                                                                                                          "type" "skip"}],
    "system" {"hostname" nil, "metadata" {}}}}
