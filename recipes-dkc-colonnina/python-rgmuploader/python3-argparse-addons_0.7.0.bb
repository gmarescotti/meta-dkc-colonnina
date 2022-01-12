
SUMMARY = "Additional argparse types and actions."
HOMEPAGE = "https://github.com/eerimoq/argparse_addons"
AUTHOR = "Erik Moqvist <erik.moqvist@gmail.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=515e9da3e929c7b40dd13458363110a7"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/82/3c/893305cd6bef596cb4059f794ba3b69d59edcb96794bec683fff5a437d0a/argparse_addons-0.7.0.tar.gz"
SRC_URI[md5sum] = "357d8ab8d20b66277c2a54a5032d4471"
SRC_URI[sha256sum] = "f5da0fe676953e39bee7a6d0a9b2f5ccdcbf9d6a6b9929997caf8f6c6b23a5fb"

S = "${WORKDIR}/argparse_addons-0.7.0"

DEPENDS += " "
RDEPENDS_${PN} = ""

BBCLASSEXTEND = "native nativesdk"
