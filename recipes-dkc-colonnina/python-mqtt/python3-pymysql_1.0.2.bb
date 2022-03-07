DESCRIPTION = "Python library to implement a well-behaved UNIX daemon process"
HOMEPAGE = "https://pagure.io/python-daemon/"
LICENSE = "CLOSED"

SRC_URI[sha256sum] = "e008127430c8dc66bb1b6d6c7a17498ec57ffa81188fc1f8c9f764363c01d12e"

# DEPENDS = "python3-docutils-native python3-protobuf"

PYPI_PACKAGE = "pymysql"
inherit pypi setuptools3

RDEPENDS_${PN} += " \
        python3-io \
        python3-resource \
    	python3-psutil \
"
