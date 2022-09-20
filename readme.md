# Comparison of binary Serialization Libraries

## Project Information
- **Java Version**: Java 17
- **Build Tool**: Maven


## Test Cases
Each test case uses tuple-like data structures, because this type of data is frequently encountered in data streams.
This means there are no nested data structures in the test cases, and they consist of textual and numerical values.

1. 10 fields. Mainly numerical values but also some strings. Half of the numerical values are integers, the other half are floating point numbers. All strings are short strings (length of 20 characters).
2. 10 fields. Mainly strings but also some numerical values. All strings are short strings.
3. 20 fields. Only numerical values. Half of the numerical values are integers, the other half are doubles.
4. 20 fields. Only textual values. Half of the fields are short strings, the other half are medium-sized strings (length of 70 characters).
5. 20 fields. Only textual values. Half of the fields are medium-sized strings, the other half are long strings (length of 300 characters).
6. 200 fields. 30 strings of varying length. 50 floating point numbers and 120 integers.


## Measurement Data
### Serialization speed in ns
Protocol          | Test 1 | Test 2 | Test 3| Test 4 | Test 5 | Test 6
--------------------|--------|--------|-------|--------|--------|-------
JSON | 1636 | 1487 | 2441 | 2970 | 6661 | 15719
BSON | 2379 | 2614 | 2688 | 5705 | 14059 | 26459
Protocol Buffers | 543 | 642 | 552 | 1758 | 4050 | 5589
Thrift (normal) | 423 | 581 | 623 | 1257 | 1638 | 5154
Thrift (compact) | 375 | 468 | 455 | 1064 | 1563 | 4647
Avro | 463 | 448 | 447 | 1095 | 1765 | 5734
Cap"n  Proto | 407 | 540 | 391 | 813 | 1679 | 1780
FlatBuffers | 567 | 809 | 651 | 2320 | 7154 | 10730
Java Serialization | 1981 | 2308 | 1920 | 3824 | 5543 | 11937


### Deserialization speed in ns
Protocol          | Test 1 | Test 2 | Test 3| Test 4 | Test 5 | Test 6
--------------------|--------|--------|-------|--------|--------|-------
JSON                | 2497   | 1831 | 3498 | 2039 | 3316 | 26380
BSON                | 2017   | 2071 | 2775 | 3587 | 3804 | 29154
Protocol Buffers    | 286    | 357 | 345 | 892 | 663 | 9955
Thrift (normal)     | 317    | 506 | 346 | 558 | 645 | 17711
Thrift (compact)    | 442    | 481 | 550 | 567 | 659 | 17229
Avro                | 818    | 858 | 893 | 1079 | 1223 | 7232
Cap"n Proto         | 249    | 343 | 305 | 256 | 210 | 269
FlatBuffers         | 110    | 93 | 93 | 89 | 81 | 82
Java Serialization  | 4095   | 4682 | 4579 | 7697 | 10901 | 34075


### File size in Bytes
Protocol          | Test 1 | Test 2 | Test 3| Test 4 | Test 5 | Test 6
--------------------|--------|--------|-------|--------|--------|-------
JSON | 258 | 326 | 490 | 1172 | 3972 | 8149
BSON | 193 | 311 | 316 | 1196 | 3996 | 6988
Protocol Buffers | 96 | 194 | 135 | 945 | 3755 | 5084
Thrift (normal) | 127 | 239 | 181 | 1041 | 3841 | 5501
Thrift (compact) | 97 | 195 | 131 | 941 | 3751 | 4901
Avro | 86 | 184 | 110 | 930 | 3740 | 4710
Cap"n Proto | 128 | 288 | 136 | 1136 | 3936 | 5136
FlatBuffers | 144 | 304 | 176 | 1172 | 3972 | 5536
Java Serialization | 271 | 407 | 382 | 1340 | 4140 | 7340
