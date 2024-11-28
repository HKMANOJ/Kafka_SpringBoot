Kafka and Zookeeper Commands
1. Start Zookeeper
To start Zookeeper server (required for Kafka to run):
sh bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start Kafka Broker
To start the Kafka server (broker):
sh bin/kafka-server-start.sh config/server.properties

3. Stop Kafka Server
To stop the Kafka broker (server):

sh bin/kafka-server-stop.sh

4. Stop Zookeeper
To stop the Zookeeper server:

sh bin/zookeeper-server-stop.sh

Kafka Topics Management
5. Create a New Topic
To create a Kafka topic:
sh bin/kafka-topics.sh --create --topic <topic-name> --bootstrap-server localhost:9092 --partitions 1 --replication-factor 1

6. List Existing Topics
To list all the Kafka topics:
sh bin/kafka-topics.sh --list --bootstrap-server localhost:9092

7. Describe a Topic
To get details about a specific topic (like partitions, replication factor):
sh bin/kafka-topics.sh --describe --topic <topic-name> --bootstrap-server localhost:9092

8. Delete a Topic
To delete a Kafka topic:
sh bin/kafka-topics.sh --delete --topic <topic-name> --bootstrap-server localhost:9092

Kafka Consumer and Producer

9. Start a Kafka Producer
To produce messages to a topic:
sh bin/kafka-console-producer.sh --topic <topic-name> --bootstrap-server localhost:9092

10. Start a Kafka Consumer
To consume messages from a topic:
sh bin/kafka-console-consumer.sh --topic <topic-name> --from-beginning --bootstrap-server localhost:9092

11. Consume Messages from a Specific Partition
To consume from a specific partition of a topic:
sh bin/kafka-console-consumer.sh --topic <topic-name> --partition <partition-id> --offset <offset-number> --bootstrap-server localhost:9092

Kafka Broker Management

12. List Consumers
To list all consumers consuming from topics:
sh bin/kafka-consumer-groups.sh --list --bootstrap-server localhost:9092

13. Describe Consumer Group
To see details of a specific consumer group:
sh bin/kafka-consumer-groups.sh --describe --group <group-name> --bootstrap-server localhost:9092
Kafka Broker Configurations

14. Check Broker Information
To check the configuration and status of a Kafka broker:
sh bin/kafka-broker-api-versions.sh --bootstrap-server localhost:9092
Useful Zookeeper Commands

15. Connect to Zookeeper CLI
To connect to the Zookeeper instance via the CLI:

sh bin/zkCli.sh -server localhost:2181

16. Check Zookeeper Status
To check the Zookeeper server status:
sh bin/zkServer.sh status

Kafka Metrics and Monitoring
17. Get Broker Metrics
Kafka also has several built-in tools for monitoring broker metrics. Use JMX (Java Management Extensions) to access broker statistics (though this may need additional configuration).
Example:
JMX_PORT=9999 ./bin/kafka-server-start.sh config/server.properties
Other Kafka Maintenance Commands

18. Reassign Partitions
To reassign partitions between brokers:
sh bin/kafka-reassign-partitions.sh --bootstrap-server localhost:9092 --reassignment-json-file <reassignment-file.json> --execute

19. Check for Under-Replicated Partitions
To check for under-replicated partitions in Kafka:

sh bin/kafka-topics.sh --describe --bootstrap-server localhost:9092 | grep "UnderRe
