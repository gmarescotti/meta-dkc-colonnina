
SUMMARY = "An implementation of JSON Schema validation for Python"
HOMEPAGE = "https://github.com/Julian/jsonschema"
AUTHOR = "Julian Berman <Julian@GrayVines.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://COPYING;md5=7a60a81c146ec25599a3e1dabb8610a8"

SRC_URI = "https://files.pythonhosted.org/packages/69/11/a69e2a3c01b324a77d3a7c0570faa372e8448b666300c4117a516f8b1212/jsonschema-3.2.0.tar.gz"
SRC_URI[md5sum] = "f1a0b5011f05a02a8dee1070cd10a26d"
SRC_URI[sha256sum] = "c8a85b28d377cc7737e46e2d9f2b4f44ee3c0e1deac6bf46ddefc7187d30797a"

S = "${WORKDIR}/jsonschema-3.2.0"

RDEPENDS_${PN} = "python3-attrs python3-pyrsistent python3-setuptools python3-six"

inherit setuptools3
