
SUMMARY = "A reusable Django field that allows you to store validated JSON in your model."
HOMEPAGE = "https://github.com/rpkilby/jsonfield/"
AUTHOR = "Brad Jasper <contact@bradjasper.com>"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1618228f6556a473e45d9e959bea42c"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/10/3b/4542fd9465908380ba4321329d3cdfeb959769ec48d878dead978286b48d/jsonfield-3.1.0.tar.gz"
SRC_URI[md5sum] = "0758b8a3b6cc67a3ba74dccdee3e8f4a"
SRC_URI[sha256sum] = "7e4e84597de21eeaeeaaa7cc5da08c61c48a9b64d0c446b2d71255d01812887a"

S = "${WORKDIR}/jsonfield-3.1.0"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django"

BBCLASSEXTEND = "native nativesdk"
