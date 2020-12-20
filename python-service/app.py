from kafka import KafkaProducer
import time

bootstrap_servers = ['kafka1:19091']
topicName = 'testTopic'
print("kafka servers", bootstrap_servers)


producer = KafkaProducer(bootstrap_servers = bootstrap_servers)

producer.send(topicName, b'ADASS!')
producer.flush()