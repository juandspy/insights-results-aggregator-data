# insights-results-aggregator-data

![GitHub go.mod Go version](https://img.shields.io/github/go-mod/go-version/RedHatInsights/insights-results-aggregator-data)
[![License](https://img.shields.io/badge/license-Apache-blue)](https://github.com/RedHatInsights/insights-results-aggregator-data/blob/master/LICENSE)

Data shared by insights-results-\* microservices.

## Messages for Insights Results Writer service

Data (messages) to be consumed by *Insights Results Writer* service (it's
source code is shared with *Insights Results Aggregator* service). These data
are stored in `messages` subdirectory and are splitted into various
sub-directories.

### Mock data for aggregator

Data to be consumed by aggregator through Kafka broker is stored in `messages/` subdirectory.
These data can be send to *Insights Results Writer* service by using the script called `produce.sh` or `produce_50k_messages.sh`.
The mentioned tools are available at https://github.com/RedHatInsights/insights-results-aggregator-utils/blob/master/input/produce.sh and
https://github.com/RedHatInsights/insights-results-aggregator-utils/blob/master/input/produce_50k_messages.sh

Several types of messages are prepared there. There are splitted into groups.


#### Messages with unexpected format and/or content

To be used for testing etc.


## Test data

`github.com/RedHatInsights/insights-results-aggregator-data/testdata` package contains files with repeated data 
to be used in tests

## Reports generated by Insights Reports Aggregator

Reports are stored in `reports` directory. It is splitted into three subdirectories:

* `original` contains reports as read from Insights Reports Aggregator
* `formatted` contains reports as formatted JSON files (for better readability)
* `edn` contains reports converted into EDN format

### Clusters that return 'static' rule results

```
34c3ecc5-624a-49a5-bab8-4fdc5e51a266
74ae54aa-6577-4e80-85e7-697cb646ff37
a7467445-8d6a-43cc-b82c-7007664bdf69
ee7d2bf4-8933-4a3a-8634-3328fe806e08
```

### Cluster that returns no results (ie just empty report)

```
eeeeeeee-eeee-eeee-eeee-000000000001
```
