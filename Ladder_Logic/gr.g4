grammar gr;
input: INPUT_NAME input | VALUE input | NEWLINE source_code;
source_code: START program;
program: OPEN_PARANTHESSES program | contact | coil;
contact: long_contact_name DIGIT operators;
coil: long_coil_name DIGIT operators;
long_contact_name: TYPE_CONTACT 'contact ' contact_name;
long_coil_name: TYPE_COIL 'coil ' coil_name;
contact_name: INPUT_NAME | MEMORY_NAME;
coil_name: OUTPUT_NAME | MEMORY_NAME;
operators: operation operators | contact operators* | coil operators* | parathesses operators | END;
operation: AND | OR;
parathesses: OPEN_PARANTHESSES | CLOSED_PARANTHESSES;
VALUE:' 0' | ' 1';
DIGIT:'0'..'8';
INPUT_NAME:'I';
MEMORY_NAME:'M';
OUTPUT_NAME:'Q';
NEWLINE: '\r\n';
TYPE_CONTACT: 'open ' | 'closed ';
TYPE_COIL: 'active ' | 'inactive ';
START: 'start';
END: 'end';
AND: ' & ';
OR: 'V';
OPEN_PARANTHESSES: ' (';
CLOSED_PARANTHESSES: ') ';