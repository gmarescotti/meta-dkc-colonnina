
SUMMARY = "REPL plugin for Click"
HOMEPAGE = "https://github.com/untitaker/click-repl"
AUTHOR = "Markus Unterwaditzer <markus@unterwaditzer.net>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fee2943fdd4d8afbac9ccc1c8ac137d5"

SRC_URI = "https://files.pythonhosted.org/packages/51/99/6a722e232f92fdc21c46fd042fea63e7c2fcda3086ff5db62edd595d3f49/click-repl-0.1.6.tar.gz"
SRC_URI[md5sum] = "2d5f4d42cbd1da9a50a49dff4d6087ca"
SRC_URI[sha256sum] = "b9f29d52abc4d6059f8e276132a111ab8d94980afe6a5432b9d996544afa95d5"

S = "${WORKDIR}/click-repl-0.1.6"

RDEPENDS_${PN} = ""

inherit setuptools3
